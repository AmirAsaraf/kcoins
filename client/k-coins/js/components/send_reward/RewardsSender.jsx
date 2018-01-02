'use strict';

import React from 'react';
import Fetch from 'react-fetch'
import { Card, CardActions, CardHeader, CardTitle, CardText } from 'material-ui/Card';
import RaisedButton from 'material-ui/RaisedButton';
import TrophySelector from './TrophySelector.jsx';
import TextField from 'material-ui/TextField';

import _ from 'lodash';
import UI from 'js/fw/lib/UI';


class RewardsSender extends React.Component {



  constructor(props) {
    super(props);
      this.state = {
          from:"donald.trump@kenshoo.com",
          to:"",
          coinsCount:0,
          trophyType:"Good Reviewer",
          imageUrl:""
      };
  }
    selectTrophy(newTrophy){

        this.setState({imageUrl:newTrophy});

    }

    sendReward(){

        console.log(this.state);
//http://localhost:9090/rest/users/email/?from="Matan.Meshi@kenshoo.com"&to="Matan.Meshi@kenshoo.com"&coinsCount=10&trophyType=THANKS_FOR_PATIENCE&imageUrl="https://www.mtsawards.com/Images/Content/Home/dept_cups.jpg"
       const response = fetch('http://localhost:9090/rest/users/email/' +
           '?from=' +this.state.from +
           '&to='+ this.state.to +
           '&coinsCount='+ this.state.coinsCount  +
           '&trophyType='+ this.state.trophyType +
           '&imageUrl='+ this.state.imageUrl, {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },

        })

    }

    changeEmail(event,value){

        this.setState({to:value});
    }

    changeKcoins(event,value){
        this.setState({coinsCount:value});
    }
  render() {

    return (

        <div>
              <CardHeader subtitle={"Choose a collegue"}/>
              <TextField
                  hintText="email" onChange={this.changeEmail.bind(this)}/>
              <br /><br /><br />

              <div class="trophySelection">
                 <CardHeader subtitle={"Select a Trophy"}/>
                  <div class="trophy-box" >

                  <TrophySelector selectTrophy={this.selectTrophy.bind(this)}></TrophySelector >
                </div>
              </div>
              <br /><br /><br />
              <CardHeader subtitle={"Reward with Kcoins"}/>
              <TextField
                  hintText="amount" onChange={this.changeKcoins.bind(this)}/>
              <span class="remaining-kcoins"> (12.75 Kcoins Remaining)</span>

        </div>
    );
  }
}

export default RewardsSender;
