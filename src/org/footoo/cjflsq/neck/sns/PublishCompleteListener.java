package org.footoo.cjflsq.neck.sns;

public interface PublishCompleteListener {
	public static final int PUBLISH_SUCCESS = 0;
	public static final int PUBLISH_FAILED = 1;
	
	public abstract void publishComplete(int flag);
}
