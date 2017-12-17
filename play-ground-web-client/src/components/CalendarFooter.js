/**
 * Created by woongs on 2017. 12. 17..
 */
import React from 'react';
import className from 'classnames/bind';
import { Glyphicon } from 'react-bootstrap';

const cx = className.bind(require('./CalendarFooter.css'));

class CalendarFooter extends React.Component {
  render(){
    return (
        <footer className={cx('cp-footer')}>
          <Glyphicon glyph="phone" className={cx('cp-phone-icon')}>
            <strong className={cx('cp-tel')}>Tel</strong>010-2075-5241
          </Glyphicon>
          <span>
            |
          </span>
          <Glyphicon glyph="envelope" className={cx('cp-email-icon')}>
            <strong className={cx('cp-email')}>Email</strong>thsdndqo00@naver.com
          </Glyphicon>
          <span>
            |
          </span>
          <span className={cx('cp-company-name')}>Copyright (c) SongsSS Corp.  All rights reserved.</span>
        </footer>
    );
  }
}

export default CalendarFooter;