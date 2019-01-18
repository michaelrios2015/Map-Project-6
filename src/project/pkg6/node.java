package project.pkg6;

/*
COSC 600
Project 6
Michael Rios
Professor H.  Zhou

 */

public class node {

	int data; 
        int visited;
        int level;
        node vertex; 
        node adjacent;
	public node() { };
	public node(int j)
	{data = j; visited = 0; level = 0; vertex = null; adjacent = null;}


}
