import React from 'react';
import CalendarHeader from './CalendarHeader';
import CalendarFooter from './CalendarFooter';

class Calendar extends React.Component {
  render(){
    return (
      <div id="this">
        <CalendarHeader />
        <h1>space for calendar</h1>
        <CalendarFooter />
      </div>
    );
  }
}

export default Calendar;