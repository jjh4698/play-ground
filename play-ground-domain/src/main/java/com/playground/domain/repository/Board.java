package com.playground.domain.repository;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coupang on 2017. 12. 24..
 */
@Entity
@Table(name = "board")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer boardId;
	@Column(name = "title", length = 30, nullable = true, columnDefinition = "제목")
	private String title;
	@Column(name = "description", length = 30, nullable = true, columnDefinition = "요약 설명")
	private String description;
	@Column(name = "category", length = 30, nullable = true, columnDefinition = "게시판 분류")
	private String category;

	// private List<Writing> writingList;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createdAt")
	private Date createdAt;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "modifiedAt")
	private Date modifiedAt;
}
