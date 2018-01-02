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
          from:"",
          to:"",
          coinsCount:0,
          trophyType:"",
          imageUrl:""
      };
  }




    selectTrophy(newTrophy){

        this.setState({imageUrl:newTrophy});

    }

    sendReward(){

        /*

       const response = fetch('http://localhost:9090/rest/users/email/', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                from: "Matan.Meshi@kenshoo.com",
                to: "Matan.Meshi@kenshoo.com",
                coinsCount:"",
                trophyType:"",
                imageUrl:""

            })
        })
*/
    }

  render() {

    return (

        <div>
              <CardHeader subtitle={"Choose a collegue"}/>
              <TextField
                  hintText="email"/>
              <br />

              <div class="trophySelection">
                 <CardHeader subtitle={"Select a Trophy"}/>
                  <div class="trophy-box" >

                  <TrophySelector selectTrophy={this.selectTrophy.bind(this)}></TrophySelector >
                </div>
              </div>
              <br />
              <CardHeader subtitle={"Reward with Kcoins"}/>
              <TextField
                  hintText="email"/>
              <span class="remaining-kcoins"> (12.75 Kcoins Remaining)</span>
              <span onClick={this.sendReward()}>
                  <RaisedButton label="Send" primary={true}  />
              </span>
        </div>
    );
  }
}

export default RewardsSender;
