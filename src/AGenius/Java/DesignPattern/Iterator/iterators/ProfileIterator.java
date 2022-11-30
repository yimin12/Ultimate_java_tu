package AGenius.Java.DesignPattern.Iterator.iterators;

import AGenius.Java.DesignPattern.Iterator.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();

}
