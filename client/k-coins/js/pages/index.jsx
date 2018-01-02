'use strict';

import React from 'react';
import { Grid, Row, Col } from 'react-flexbox-grid';
import MyCard from '../components/MyCard.jsx';

class Index extends React.Component {

  constructor(props) {
    super(props);
  }

  render() {

    return (
      <Grid>
        <br />
        <Row>
          <Col xs={12}>
            <MyCard title={`Welcome!`}/>
            <MyCard title={`Welcome!`}/>
          </Col>
        </Row>
      </Grid>
    );
  }
}

export default Index;
