'use strict';

import React from 'react';
import { Card, CardActions, CardHeader, CardTitle, CardText } from 'material-ui/Card';
import RaisedButton from 'material-ui/RaisedButton';
import TrophySelector from './TrophySelector.jsx';

import _ from 'lodash';
import UI from 'js/fw/lib/UI';


class RewardsSender extends React.Component {

  constructor(props) {
    super(props);
      this.state = {
          selectedTrophy:'aaaa'
      };
  }

    selectTrophy(newTrophy){
        this.setState({selectedTrophy:newTrophy});
    }

  render() {

    const { title, subtitle, content } = this.props

    return (

        <div>
          <form action="#" method="get">
              <CardHeader subtitle={"Choose a collegue"}/>
              <input type="email" name="email" placeholder="email"/>
              <input type="text" name="selectedTrophy" value={this.state.selectedTrophy} hidden/>
              <div class="trophySelection">
                 <CardHeader subtitle={"Select a Trophy"}/>
                  <div class="trophy-box" >

                  <TrophySelector selectTrophy={this.selectTrophy.bind(this)}></TrophySelector >
                </div>
              </div>
              <CardHeader subtitle={"Reward with Kcoins"}/>
              <input type="text" name="coins" placeholder="Reward Amount"/>
              <span class="remaining-kcoins"> (12.75 Kcoins Remaining)</span>

          </form>



          <RaisedButton label="Send" primary={true}  />
        </div>
    );
  }
}

export default RewardsSender;
