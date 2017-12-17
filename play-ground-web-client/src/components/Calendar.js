import React from 'react';
import CalendarHeader from './CalendarHeader';
import CalendarFooter from './CalendarFooter';

class Calendar extends React.Component {
  render(){
    return (
      <div id="here">
        <CalendarHeader />
        <h1>Hello React Skeleton</h1>
        <CalendarFooter />
      </div>
    );
  }
}

export default Calendar;