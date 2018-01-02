'use strict';

import React from "react";
import {Card, CardHeader} from "material-ui/Card";
import {CardMedia, CardTitle} from "material-ui";

const user_pane_style = {
    width: 230,
    margin: 10
};

const image_style = {
    width: 200,
    height: 200,
    margin: 8
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
                                src="https://www.metro.us/sites/default/files/styles/normal_article/public/main/articles/2015/12/19/Screen-Shot-2015-11-03-at-1.23.38-PM_1.png"
                                alt="" style={image_style}/>
                        </CardMedia>
                    </div>
                    <CardTitle title="KCoins" subtitle="12.25M"/>
                </Card>
            </div>
        );
    }
}

export default UserPane;
