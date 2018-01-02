'use strict';

import React from 'react';
import Dialog from 'material-ui/Dialog';
import FlatButton from 'material-ui/FlatButton';
import RaisedButton from 'material-ui/RaisedButton';
import DatePicker from 'material-ui/DatePicker';
import {FloatingActionButton} from "material-ui";
import {ActionThumbUp} from "material-ui/svg-icons/index";

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
    };

    handleOpen = () => {
        this.setState({open: true});
    };

    handleClose = () => {
        this.setState({open: false});
    };

    render() {
        const actions = [
            <FlatButton
                label="Ok"
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
                    title="Dialog With Date Picker"
                    actions={actions}
                    modal={false}
                    open={this.state.open}
                    onRequestClose={this.handleClose}>
                    Open a Date Picker dialog from within a dialog.
                    <DatePicker hintText="Date Picker"/>
                </Dialog>
            </div>
        );
    }
}

export default SendRewardModal;
