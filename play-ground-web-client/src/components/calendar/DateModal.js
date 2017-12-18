/**
 * Created by woongs on 2017. 12. 17..
 */
import React from 'react';
import className from 'classnames/bind';
import { Glyphicon, Modal } from 'react-bootstrap';

const cx = className.bind(require('./css/DateModal.css'));

class DateModal extends React.Component {

  props: {
    showModal: boolean,
    date: string
  };

  render(){
    const {showModal, date} = this.props;
    return (
      <Modal show={showModal}>
        <div>
          {date}
        </div>
      </Modal>
    );
  }
}

export default DateModal;