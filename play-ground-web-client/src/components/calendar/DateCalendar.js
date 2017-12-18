/**
 * Created by woongs on 2017. 12. 17..
 */
import React from 'react';
import { Glyphicon } from 'react-bootstrap';
import BigCalendar from 'react-big-calendar';
import moment from 'moment';
import 'react-big-calendar/lib/css/react-big-calendar.css';
import className from 'classnames/bind';
import DateModal from './DateModal';

const cx = className.bind(require('./css/Calendar.css'));

BigCalendar.momentLocalizer(moment);

class DateCalendar extends React.Component {
  constructor() {
    super();

    this.state = {
      events: [],
      dateModal: false,
      date: ''
    };
    this.handleSelectEvent= this.handleSelectEvent.bind(this);
    this.modalClose = this.modalClose.bind(this);
  }

  formatDate(date) {
    var d = new Date(date),
      month = '' + (d.getMonth() + 1),
      day = '' + d.getDate(),
      year = d.getFullYear();

    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;

    console.log([year, month, day].join('-'));

    return [year, month, day].join('-');
  }

  handleSelectEvent(slotInfo) {
    console.log("handleSelectEvent's event="+slotInfo.start);
    this.setState({
      dateModal: true,
      date: this.formatDate(slotInfo.start)
    })
  }



  modalClose() {
    this.setState({
      dateModal: false,
      date: ''
    });
  }


  render(){
    return (
      <div className={cx('cx-calendar')}>
        <BigCalendar
          selectable
          events={this.state.events}
          onSelectSlot={(slotInfo) => this.handleSelectEvent(slotInfo)}
          views={['month']}
          style={{height: 800}}
        />
        <DateModal
          showModal={this.state.dateModal}
          date={this.state.date}
        />
      </div>

    );
  }
}

export default DateCalendar;