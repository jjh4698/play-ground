package com.playground.domain.repository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coupang on 2017. 12. 24..
 */
@Data
@Entity
@Table(name = "writing")
public class Writing {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer writingId;
	@Column(name = "title", length = 30, nullable = false, updatable = true, columnDefinition = "제목")
	private String title;
	@Column(name = "subject", nullable = true, updatable = false, columnDefinition = "말 머리")
	private String subject;
	@Column(name = "content", nullable = true, updatable = true, columnDefinition = "글 내용")
	private String content;
	@ManyToOne
	@JoinColumn(name = "board_id")
	private Board board;
	@Column(name = "createdAt")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdAt;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "modifiedAt")
	private Date modifiedAt;
}
