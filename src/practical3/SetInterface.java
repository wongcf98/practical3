/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

/**
 *
 * @author Tarc
 */
public interface SetInterface<T> {
    
    /* Description : To add new element to a set
    Precondition: Must have input i -- newElement, 
                    i is an object with generic type
    PostCondition: newElement added to the set
    Returns     : true if the newElement is succesfully added into the set, 
                    false if newElement is not succesfully added into the set */
    public boolean add(T newElement);
    /* Description : To remove an element from the set
    Precondition: the anElement exist in the set
    PostCondition: anElement is removed from the set
    Returns     : */
    public boolean remove(T anElement);
    /* Description : To check he anotherSet is a subset of the currentSet
    Precondition: The anotherSet and currentSet must exist
    PostCondition: The elements in anotherSet and current
    Returns     : */
    public boolean checkSubset(Set anotherSet);
    /* Description : To merge the element in anotherSet into the currentSet
    Precondition: anotherSet and currentSet must exist 
    PostCondition: the element in anotherSet will be added into currentSet
    Returns     : */
    public void union (Set anotherSet);
    /* Description : 
    Precondition: 
    PostCondition: 
    Returns     : */
    public Set intersaction(Set anotherSet);
    
    public boolean isEmpty(Set anotherSet);
}
