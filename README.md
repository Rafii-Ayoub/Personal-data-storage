# Personal data storage

![](https://forthebadge.com/images/badges/made-with-java.svg) ![](https://forthebadge.com/images/badges/built-with-love.svg)


Many applications around the world handle “personal data” of varying sizes. A data is said to be personal if it is not accessed only by one user. In order to provide an efficient service, the storage has different system nodes and must place the data on these different nodes.
    
Each system node can receive one or more data depending on of their size. The storage capacity of such a node is its own and can differ according to the nodes. Moreover, a system node can communicate with all other system nodes and some users.
Users are interested in a list of data and can only access that data. They can communicate directly with a single node system and cannot communicate with other users.

Note: In such a context, the communication time between two nodes system or a system node and a user differ according to the users and concerned system nodes. For the sake of simplicity, we will consider that the time communication between two nodes ni, nj is constant, but different from time communication from another couple: neither, nk.

> [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)  [![Open Source? Yes!](https://badgen.net/badge/Open%20Source%20%3F/Yes%21/blue?icon=github)](https://github.com/Naereen/badges/)
## We will model this using data structures: 
  * Nodes. 
  * Arcs.
  * Trees.

## We used this diagram as an example of our system
![](images/diagram1.PNG)

## To start coding I made a UML diagram
![](images/uml1.PNG)

## The first step is to to find an efficient placement for the data of the system: each data must be placed as close as possible to the user interested in this data.
![](images/figure1.PNG)

## The second step is to to find an efficient placement for the data so that two users can be interested by the same data. We use for this Djikstra Algorithm.
![](images/figure2.PNG)

## The third step is to to optimize data storing using MKP Algorithm.
![](images/figure3.PNG)
