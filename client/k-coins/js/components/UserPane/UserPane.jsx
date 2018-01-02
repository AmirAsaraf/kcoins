'use strict';

import React from "react";
import {Card, CardHeader} from "material-ui/Card";
import {CardMedia} from "material-ui";
import {ActionCopyright} from "material-ui/svg-icons/index";

const user_pane_style = {
    width: 230,
    margin: 10
};

const image_style = {
    width: 200,
    height: 200,
    margin: 8
};

const coins_container_style = {
};

const coin_style = {
    display: "inline-flex",
    flex: 1,
    margin: "0px 5px 5px 12px",
    color: "rgba(0, 0, 0, 0.54)",
    fontSize: 14
};

const header_style = {
    marginLeft: 15,
    fontSize: 24,
    color: "rgba(0, 0, 0, 0.87)",
    display: "block",
};

const coin_value = {
    lineHeight: 1.8
};

const coin_color = {
    color: "rgba(0, 0, 0, 0.54)"
};

class UserPane extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div style={user_pane_style}>
                <Card>
                    <CardHeader
                        title="Donald Trump"
                        subtitle="donald.trump@kenshoo.com"
                        actAsExpander={false}
                        showExpandableButton={false}
                    />
                    <div style={image_style}>
                        <CardMedia>
                            <img
                                src={require('../../../img/trump_avatar.png')}
                                alt="" style={image_style}/>
                        </CardMedia>
                    </div>
                    <div style={coins_container_style}>
                        <div style={header_style}>
                            KCoins
                        </div>
                        <div style={coin_style}>
                            <ActionCopyright style={coin_color} />
                            <div style={coin_value}>12.25M</div>
                        </div>
                    </div>

                </Card>
            </div>
        );
    }
}

export default UserPane;
