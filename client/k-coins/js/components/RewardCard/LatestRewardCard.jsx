'use strict';

import React from "react";
import {Card} from "material-ui";

const style = {};

const card_media_style = {
    textAlign: "center"
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

class LatestRewardCard extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {

        const {to, trophyTitle, message, trophyIndex, imageSource} = this.props;

        //let imageSource = 'http://dogdayzz.com/images/theme-none/awards/' + trophyIndex + '.png';

        const cardData = (
            <div style={reward_card_style}>
                <div style={image_container_style}>
                    <div style={card_media_style}>
                        <img src={imageSource} width="80" height="80"/>
                    </div>
                    <div>{trophyTitle}</div>
                </div>
                <div style={message_style}><b>{to}</b> has been rewarded! <i>"{message}"</i></div>
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

export default LatestRewardCard;
