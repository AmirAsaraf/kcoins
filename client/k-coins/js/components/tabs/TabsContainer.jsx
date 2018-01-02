'use strict';

import React from "react";
import {Tab, Tabs} from "material-ui";
import {MapsLocalActivity, SocialWhatshot} from "material-ui/svg-icons/index";
import LatestRewardCard from "../RewardCard/LatestRewardCard.jsx";
import MyRewardCard from "../RewardCard/MyRewardCard.jsx";

const tabs_container_style = {
    flex: 1
};

class TabsContainer extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <Tabs style={tabs_container_style}>
                <Tab
                    icon={<SocialWhatshot />}
                    label="Latest Rewards"
                >
                    <LatestRewardCard to="Gal Gadot" trophyTitle="World Saver"
                                      message="You are awesome! thanks for saving the world!" trophyIndex="1"/>
                    <LatestRewardCard to="Kim Jong-un" trophyTitle="Peace Breaker"
                                      message="Stop breaking the master peace branch. Please run tests before you push"
                                      trophyIndex="2"/>
                    <LatestRewardCard to="Kim Jong-un" trophyTitle="Peace Breaker"
                                      message="Stop breaking the master peace branch. Please run tests before you push"
                                      trophyIndex="3"/>
                    <LatestRewardCard to="Kim Jong-un" trophyTitle="Peace Breaker"
                                      message="Stop breaking the master peace branch. Please run tests before you push"
                                      trophyIndex="2"/>
                    <LatestRewardCard to="Kim Jong-un" trophyTitle="Peace Breaker"
                                      message="Stop breaking the master peace branch. Please run tests before you push"
                                      trophyIndex="3"/>
                </Tab>
                <Tab
                    icon={<MapsLocalActivity />}
                    label="My Rewards"
                >
                    <MyRewardCard from="Bibi Nenatanyahu" trophyTitle="Best Hair Cut" message="Love your hair cut! Sarah too :)" trophyIndex="3" kcoins="2.45"/>
                </Tab>
            </Tabs>
        );
    }
}

export default TabsContainer;
