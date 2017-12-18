import React from 'react';
import CalendarHeader from './CalendarHeader';
import CalendarFooter from './CalendarFooter';
import DateCalendar from './DateCalendar';

class Calendar extends React.Component {
  render(){
    return (
      <div id="this">
        <CalendarHeader />
        <DateCalendar />
        <CalendarFooter />
      </div>
    );
  }
}

export default Calendar;