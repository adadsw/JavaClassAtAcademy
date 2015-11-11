package com.brain.ch17;

public class BBSItem implements java.io.Serializable {
	static int itemNum = 0;
	String writer;
	transient String passwd;
	String title;
	String content;
	Object attachment;
	BBSItem(String writer, String passwd, String title, String content) {
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	void modifyContent(String content, String passwd) {
		if (!passwd.equals(this.passwd))
			return;
		this.content = content;
	}
	void addAttachment(Object attachment) {		// 파일을 첨부한다
		this.attachment = attachment;
	}

}
