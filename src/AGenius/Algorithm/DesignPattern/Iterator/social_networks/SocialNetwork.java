package AGenius.Algorithm.DesignPattern.Iterator.social_networks;

import AGenius.Algorithm.DesignPattern.Iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
