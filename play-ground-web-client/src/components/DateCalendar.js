/**
 * Created by woongs on 2017. 12. 17..
 */
import React from 'react';
import { Glyphicon } from 'react-bootstrap';
import BigCalendar from 'react-big-calendar';
import moment from 'moment';
import 'react-big-calendar/lib/css/react-big-calendar.css';
import className from 'classnames/bind';

const cx = className.bind(require('./Calendar.css'));

BigCalendar.momentLocalizer(moment);

class DateCalendar extends React.Component {
  constructor() {
    super();
    this.state = {
      events: [],
    };
  }

  render(){
    return (
      <div className={cx('cx-calendar')}>
        <BigCalendar
          events={this.state.events}
          style={{height: 800}}
        />
      </div>
    );
  }
}

export default DateCalendar;