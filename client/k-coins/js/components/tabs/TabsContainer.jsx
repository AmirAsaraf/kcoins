'use strict';

import React from "react";
import {Tab, Tabs} from "material-ui";
import {MapsLocalActivity, SocialWhatshot} from "material-ui/svg-icons/index";
import LatestRewardCard from "../RewardCard/LatestRewardCard.jsx";
import MyRewardCard from "../RewardCard/MyRewardCard.jsx";
import Images from "../Images";

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
                    <LatestRewardCard to="Elinor Komissar" trophyTitle="Company Master"
                                      message="Thanks for bringing light for social floor! May the blessing of Light be on you"
                                      imageSource={Images.company_master}/>
                    <LatestRewardCard to="Clean Code?" trophyTitle="Not your Best Code"
                                      message="Your code is dirty like a pig in mud! "
                                      imageSource={Images.not_your_best_code2}/>
                    <LatestRewardCard to="I have no life" trophyTitle="Best Digger"
                                      message="Thanks for killing me in the PR review"
                                      imageSource={Images.build_breaker}/>
                    <LatestRewardCard to="Arnold Bug Hater" trophyTitle="Bugs Terminator"
                                      message="Nice work on fixing all our bugs!! Hasta la vista, baby!"
                                      imageSource={Images.bugs_terminator2}/>
                    <LatestRewardCard to="Bad Coder" trophyTitle="Build Breaker"
                                      message="You broke the build 3 times this week. Thanks for killing jenkins :0"
                                      imageSource={Images.broke_the_build}/>
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
