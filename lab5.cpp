//lab5.cpp
#include "pch.h"
#include <iostream>
#include <string>
using namespace std;
void main(void)
{
	char a, b, c;
	cin >> a;
	clip clip1("Beethoven", "sonata", 150, 30000, 320, "Flower", 1720, 11);
	clip1.getPerformer();
	clip1.getName();
	clip1.getDuration();
	clip1.getViews();
	clip1.getBitRate();
	clip1.getAlbum();
	clip1.getAge();
	clip1.getWeight();

	cin >> b;
	clip clip2("Kendric", "KingsDead", 180, 3000000, 320, "DNA", 2018, 12);
	clip2.getPerformer();
	clip2.getName();
	clip2.getDuration();
	clip2.getViews();
	clip2.getBitRate();
	clip2.getAlbum();
	clip2.getAge();
	clip2.getWeight();

	cin >> c;
	clip clip3("Shtepan Giga", "This Dream", 200, 100000, 228, "Kvitoslava", 2015, 8);
	clip3.getPerformer();
	clip3.getName();
	clip3.getDuration();
	clip3.getViews();
	clip3.getBitRate();
	clip3.getAlbum();
	clip3.getAge();
	clip3.getWeight();
}
