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





  render() {

    return (

        <div>
              <CardHeader subtitle={"Choose a collegue"}/>
              <TextField
                  hintText="email" onChange={this.props.changeEmail}/>
              <br /><br /><br />

              <div class="trophySelection">
                 <CardHeader subtitle={"Select a Trophy"}/>
                  <div class="trophy-box" >

                  <TrophySelector selectTrophy={this.props.selectTrophy}></TrophySelector >
                </div>
              </div>
              <br /><br /><br />
              <CardHeader subtitle={"Reward with Kcoins"}/>
              <TextField
                  hintText="amount" onChange={this.props.changeKcoins}/>
              <span class="remaining-kcoins"> (12.75 Kcoins Remaining)</span>

        </div>
    );
  }
}

export default RewardsSender;
