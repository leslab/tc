package tc;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.Status;
import java.util.List;

// 2016/10/12
// Eclipse+mavenでビルド

public class Tc {
    public static void main( String[] args ) throws TwitterException
    {
        Twitter twitter = new TwitterFactory().getInstance();
        User user = twitter.verifyCredentials();
        
        //ユーザ情報取得
        System.out.println("ユーザー名　：" + user.getName());
        System.out.println("表示名　　　：" + user.getScreenName());
        System.err.println("フォロー数　：" + user.getFriendsCount());
        System.out.println("フォロワー数：" + user.getFollowersCount());
        
        List<Status> statuses = twitter.getHomeTimeline();
        for (Status status : statuses) {
            System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
        }

    }
}
