/**
 * Created by woongs on 2017. 12. 17..
 */
import React from 'react';
import className from 'classnames/bind';
import { Glyphicon } from 'react-bootstrap';

const cx = className.bind(require('./css/CalendarHeader.css'));

class CalendarHeader extends React.Component {
  render(){

    return (
      <header className={cx('cp-header')}>
        <h1 className={cx('cp-brand')}>Songss</h1>
      </header>
    );
  }
}

export default CalendarHeader;