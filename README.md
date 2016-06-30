# Statistical Model Intent Classification vs. Chance Adjusted model

This project's aim is to create a classifier that accepts text input and classifies with a certain
category(intent) using two different models and gauging their performance against one another. For 
our purposes we will be using the MASC data set (http://www.anc.org/data/masc/)

The project will implement 2 different model functions...
	1) A traditional chance adjusted model based on agreement between annotators(voting) on annotations 
	   and adjusted for the occurance of an agreed incorrect answer with chance coefficients and..
	2) A Bayesian Statistical model modeled after the one specified in the paper "The Benefits of a Model of Annotation"(https://aclweb.org/anthology/W/W13/W13-2323.pdf)
	   by Rebecca J. Passonneau and Bob Carpenter


