//pch.h
#pragma once
#include <iostream>
#include <string>
using namespace std;
class clip {
	string performer;
	string name;
	int duration;
	int views;
protected:
	int bitRate;
	string album;
public:
	double age, weight;
	clip() {

	}
	clip(string Performer, string Name, int Duration, int Views, int BitRate, string Album,
		double Age, double Weight) {
		performer = Performer;
		name = Name;
		duration = Duration;
		views = Views;
		bitRate = BitRate;
		album = Album;
		age = Age;
		weight = Weight;
	}
	void getPerformer() {
		cout << "performer=" << performer << "\n";
	}
	void getName() {
		cout << "name=" << name << "\n";
	}
	void getDuration() {
		cout << "duration=" << duration << "\n";
	}
	void getViews() {
		cout << "views=" << views << "\n";
	}
	void getBitRate() {
		cout << "bitRate=" << bitRate << "\n";
	}
	void getAlbum() {
		cout << "album=" << album << "\n";
	}
	void getAge() {
		cout << "age=" << age << "\n";
	}
	void getWeight() {
		cout << "weight=" << weight << "\n";
	}
};