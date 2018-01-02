'use strict';

import React from "react";
import TrophySelector from "./TrophySelector.jsx";
import TextField from "material-ui/TextField";
import {ActionCopyright} from "material-ui/svg-icons/index";

const trophy_section_inline_style = {
    display: "inline-flex",
    marginTop: 10
};

const trophy_selection_style = {
    marginTop: 10,
    marginBottom: 10
};
const margin_top_style = {
    marginTop: 10
};


const coin_color = {
    marginTop: 10,
    color: "rgba(0, 0, 0, 0.54)"
};

const copyright_style = {
    marginTop: 27,
    marginRight: 3
}


class RewardsSender extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            from: "donald.trump@kenshoo.com",
            to: "",
            coinsCount: 0,
            trophyType: "Good Reviewer",
            imageUrl: ""
        };
    }

    render() {

        return (

            <div>
                <TextField floatingLabelText="Recipient mail" onChange={this.props.changeEmail}/>
                <div style={trophy_selection_style}>
                    <div>Select a Trophy</div>
                    <div>
                        <TrophySelector selectTrophy={this.props.selectTrophy}></TrophySelector >
                    </div>
                </div>
                <div>
                    <TextField
                        hintText="Great work..."
                        floatingLabelText="Reward Message"
                        multiLine={true}
                        rows={2}
                        onChange={this.props.changeMessage}
                    />
                </div>
                <div style={trophy_section_inline_style}>
                    <div style={copyright_style}><ActionCopyright style={coin_color}/></div>
                    <TextField floatingLabelText="KCoins amount" onChange={this.props.changeKcoins}/>
                </div>
            </div>
        );
    }
}

export default RewardsSender;
