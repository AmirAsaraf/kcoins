'use strict';

import React from 'react';
import Dialog from 'material-ui/Dialog';
import FlatButton from 'material-ui/FlatButton';
import RaisedButton from 'material-ui/RaisedButton';
import DatePicker from 'material-ui/DatePicker';
import {FloatingActionButton} from "material-ui";
import {ActionThumbUp, ContentAdd} from "material-ui/svg-icons/index";
import RewardsSender from './RewardsSender.jsx'

const style = {
    position: "absolute",
    right: 20,
    bottom: 20
};

class SendRewardModal extends React.Component {

    constructor(props) {
        super(props);
    }

    state = {
        open: false,
        from:"donald.trump@kenshoo.com",
        to:"",
        coinsCount:0,
        trophyType:"THANKS_FOR_PATIENCE",
        imageUrl:""
    };

    changeEmail(event,value){

        this.setState({to:value});
    }

    changeKcoins(event,value){
        this.setState({coinsCount:value});
    }
    selectTrophy(newTrophy){

        this.setState({imageUrl:newTrophy});

    }

    handleOpen = () => {
        this.setState({open: true});
    };

    handleClose = () => {
        this.setState({open: false});
        this.sendReward();
    };


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


    render() {
        const actions = [
            <FlatButton
                label="Submit"
                primary={true}
                keyboardFocused={true}
                onClick={this.handleClose}
            />,
        ];

        return (
            <div>
                <FloatingActionButton style={style} onClick={this.handleOpen}>
                    <ActionThumbUp />
                </FloatingActionButton>
                <Dialog
                    title="Reward a collegue"
                    actions={actions}
                    modal={false}
                    open={this.state.open}
                    onRequestClose={this.handleClose}>

                    <RewardsSender changeKcoins={this.changeKcoins.bind(this)} changeEmail={this.changeEmail.bind(this)} selectTrophy={this.selectTrophy.bind(this)}/>
                </Dialog>
            </div>
        );
    }
}

export default SendRewardModal;
