package com.playground.domain.repository;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coupang on 2017. 12. 24..
 */
@Entity
@Table(name = "comment")
public class Comment {
	@Id
	@Column(name = "commentId", columnDefinition = "PK")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer commentId;
	@Column(name = "writerId", columnDefinition = "작성자")
	private String writerId;
	@Column(name = "content", length = 255, columnDefinition = "내용")
	private String content;
	@Column(name = "fromWriting", columnDefinition = "댓글 대상에 해당하는 원본 글")
	private String fromWriting;
	@ManyToOne
	@JoinColumn(name = "writingId")
	private Writing writing;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createdAt")
	private Date createdAt;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "modifiedAt")
	private Date modifiedAt;
}
