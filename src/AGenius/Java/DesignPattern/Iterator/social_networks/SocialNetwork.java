package AGenius.Java.DesignPattern.Iterator.social_networks;

import AGenius.Java.DesignPattern.Iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
