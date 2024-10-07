package model.domain;

public class ReplyDTO {
	private int id;
	private String name;
	private String content;
	private int refid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRefid() {
		return refid;
	}
	public void setRefid(int refid) {
		this.refid = refid;
	}
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", name=" + name + ", content=" +content + ", refid=" + refid + "]";
	}
	
}
