'use strict';

import React from "react";
import {Card} from "material-ui";

const card_media_style = {
    width: 60,
    height: 60
};

const reward_card_style = {
    display: "inline-flex"
};

const image_container_style = {
    margin: 10,
    textAlign: "center",
    width: 100
};

const message_style = {
    margin: 10,
};

class MyRewardCard extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {

        const {from, trophyTitle, message, trophyIndex } = this.props;

        let imageSource = 'http://dogdayzz.com/images/theme-none/awards/' + trophyIndex + '.png';

        const cardData = (
            <div style={reward_card_style}>
                <div style={image_container_style}>
                    <img src={imageSource} alt=""/>
                    <div>{trophyTitle}</div>
                </div>
                <div style={message_style}>You have been rewarded by <b>{from}</b>! This is what he said about you: <i>{message}</i></div>
                </div>
            );

        return (
            <Card>
                { cardData }
                { this.props.children }
            </Card>
        );
    }
}

export default MyRewardCard;
