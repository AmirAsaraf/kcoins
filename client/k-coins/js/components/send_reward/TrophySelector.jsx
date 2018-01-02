import React from "react";
import {GridList, GridTile} from "material-ui/GridList";


const styles = {
    root: {
        display: 'flex',
        flexWrap: 'wrap',
        justifyContent: 'space-around',
        margin: 10
    },
    gridList: {
        display: 'flex',
        flexWrap: 'nowrap',
        overflowX: 'auto',
    },
    titleStyle: {
        color: 'rgb(0, 188, 212)',
    },
    tileClick: {
        'box-shadow': '0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23)',
    }
};

/**
 * This example demonstrates the horizontal scrollable single-line grid list of images.
 */
class TrophySelector extends React.Component {
    constructor(props) {
        super(props);

    }

    handleTrophySelection(e) {
        const newTrophy = 'https://cdn.trophystore.co.uk/Img/Dynamic/Product/A1641.jpg?w=300&h=350';
        this.props.selectTrophy(newTrophy);
    }


    render() {
        return (
            <div style={styles.root}>
                <GridList style={styles.gridList} cols={2.2}>
                    <GridTile
                        key="1"
                        title="World Saver"
                        titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)">
                        <img src={require('../../../img/trophy_1.png')}/>
                    </GridTile>
                    <GridTile
                        key="2"
                        title="Peace Breaker"
                        titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)">
                        <img src={require('../../../img/trophy_2.png')}/>
                    </GridTile>
                    <GridTile
                        key="3"
                        title="World Saver"
                        titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)">
                        <img src={require('../../../img/trophy_3.png')}/>
                    </GridTile>
                    <GridTile
                        key="3"
                        title="World Saver"
                        titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)">
                        <img src={require('../../../img/trophy_1.png')}/>
                    </GridTile>
                    <GridTile
                        key="4"
                        title="Peace Breaker"
                        titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)">
                        <img src={require('../../../img/trophy_2.png')}/>
                    </GridTile>
                    <GridTile
                        key="5"
                        title="World Saver"
                        titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)">
                        <img src={require('../../../img/trophy_3.png')}/>
                    </GridTile>
                </GridList>
            </div>
        );
    }

}

export default TrophySelector;