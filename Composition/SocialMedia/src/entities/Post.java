package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private ArrayList<Comment> comments = new ArrayList <>();
	
	public Post (Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void addComment (Comment newComment) {
		comments.add(newComment);
	}
	
	public void removeComment (Comment comment) {
		comments.remove(comment);
	}
	
	public ArrayList <Comment> getComments(){
		return comments;
	}
	
	public Date getDate() {
		return moment;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment comment : comments) {
			sb.append(comment.getText() + "\n");
		}
		return sb.toString();
	}
}
