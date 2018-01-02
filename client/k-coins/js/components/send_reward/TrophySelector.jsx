import React from 'react';
import {GridList, GridTile} from 'material-ui/GridList';
import IconButton from 'material-ui/IconButton';
import StarBorder from 'material-ui/svg-icons/toggle/star-border';


const styles = {
    root: {
        display: 'flex',
        flexWrap: 'wrap',
        justifyContent: 'space-around',
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

const tilesData = [
    {
        img: 'https://vignette.wikia.nocookie.net/sonic/images/c/c3/Trophy_Gold_result.png',
        title: 'Breakfast',

    },
    {
        img: 'https://vignette3.wikia.nocookie.net/clubpenguin/images/d/de/Pizza_Eating_Contest_trophy.png/revision/latest?cb=20120924162215',
        title: 'Tasty burger',

    },
    {
        img: 'https://cdn.trophystore.co.uk/Img/Dynamic/Product/A1641.jpg?w=300&h=350',
        title: 'Camera',

    },



];

/**
 * This example demonstrates the horizontal scrollable single-line grid list of images.
 */
class TrophySelector extends React.Component {
    constructor(props) {
        super(props);



    }

    handleTrophySelection(e){
        const newTrophy='https://cdn.trophystore.co.uk/Img/Dynamic/Product/A1641.jpg?w=300&h=350';
        this.props.selectTrophy(newTrophy);
    }


    render()
    {
        return (
        <div style={styles.root}>
            <GridList style={styles.gridList} cols={2.2}>
                {tilesData.map((tile) => (
                    <span  onClick={this.handleTrophySelection.bind(this)}>
                        <GridTile
                            key={tile.img}
                            title={tile.title}
                            titleStyle={styles.titleStyle}
                            titleBackground="linear-gradient(to top, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)"
                        >
                            <img src={tile.img}/>
                        </GridTile>
                    </span>
                ))}
            </GridList>
        </div>
        );
    }

}

export default TrophySelector;