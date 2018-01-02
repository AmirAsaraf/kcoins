'use strict';

import React from "react";

import getMuiTheme from "material-ui/styles/getMuiTheme";
import myTheme from "./themes/theme.js";

import Header from "./components/Header.jsx";
import Footer from "./components/Footer.jsx";
import SendRewardModal from "./components/send_reward/SendRewardModal.jsx";
import UserPane from "./components/UserPane/UserPane.jsx";
import TabsContainer from "./components/tabs/TabsContainer.jsx";

const main_container_style = {
    display: "flex"
};

class Application extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            open: true
        };
    }


    getChildContext() {
        return {muiTheme: getMuiTheme(myTheme)};
    }


    _handleDrawerEvent(open) {
        this.setState({open});
    }


    _handleToggle() {
        this.setState({
            open: !this.state.open
        })
    }

    _handleClose() {
        this.setState({
            open: false
        })
    }

    _handleSendRewardClick() {
        console.log("hello");
    }

    render() {
        const {route} = this.props;
        const title = route.title || "Title"

        return (
            <div>
                <Header title={title} handleToggle={this._handleToggle.bind(this)}/>
                <SendRewardModal/>
                <div style={main_container_style}>
                    <UserPane/>
                    <TabsContainer/>
                </div>
                <Footer hidden={true}/>
            </div>
        );
    }
}

Application.childContextTypes = {
    muiTheme: React.PropTypes.object.isRequired
};

export default Application;
