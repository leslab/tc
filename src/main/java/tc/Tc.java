package tc;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class Tc {
    public static void main( String[] args ) throws TwitterException
    {
        Twitter twitter = new TwitterFactory().getInstance();
        User user = twitter.verifyCredentials();
        
        //���[�U���擾
        System.out.println("���[�U�[���@�F" + user.getName());
        System.out.println("�\�����@�@�@�F" + user.getScreenName());
        System.err.println("�t�H���[���@�F" + user.getFriendsCount());
        System.out.println("�t�H�����[���F" + user.getFollowersCount());

    }
}
