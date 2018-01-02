'use strict';

import React from "react";

import getMuiTheme from "material-ui/styles/getMuiTheme";
import myTheme from "./themes/theme.js";

import {Col, Grid, Row} from "react-flexbox-grid";

import Header from "./components/Header.jsx";
import MyDrawer from "./components/MyDrawer.jsx";
import Footer from "./components/Footer.jsx";


import routes from "./config/routes.json";
import SendRewardModal from "./components/send_reward/SendRewardModal.jsx";


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
                <Grid>
                    <Row>
                        <Col md={12}>
                            { this.props.children }
                        </Col>
                    </Row>
                </Grid>
                <MyDrawer
                    handleClose={this._handleClose.bind(this)}
                    handleToggle={this._handleToggle.bind(this)}
                    handleDrawerEvent={this._handleDrawerEvent.bind(this)}
                    open={this.state.open}
                    routes={routes}
                />
                <Footer hidden={true}/>
            </div>
        );
    }
}

Application.childContextTypes = {
    muiTheme: React.PropTypes.object.isRequired
};

export default Application;
