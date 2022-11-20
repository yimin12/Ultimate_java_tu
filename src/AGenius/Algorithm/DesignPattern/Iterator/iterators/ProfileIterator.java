package AGenius.Algorithm.DesignPattern.Iterator.iterators;

import AGenius.Algorithm.DesignPattern.Iterator.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();

}
