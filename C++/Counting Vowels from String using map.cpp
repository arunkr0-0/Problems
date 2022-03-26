#include<bits/stdc++.h>
#include<map>
#include<string>

using namespace std;
int main(){
	map<char,int>mp;
	string str="iloveyouappleyes";
	
	mp.insert({'a',0});
	mp.insert({'e',0});
	mp.insert({'i',0});
	mp.insert({'o',0});
	mp.insert({'u',0});
	
	for(int x=0;x<str.length();x++){
		if(str[x]=='a' || str[x] == 'e' || str[x] == 'i' || str[x] == 'o' || str[x] == 'u'){
			mp[str[x]]++;
		}

	}
cout <<"a - " << mp['a']<<endl;
	cout <<"e - " << mp.at('e')<<endl<<"i - " << mp.at('i')<<endl<<"o - " << mp.at('o')<<endl<<"u - " << mp.at('u')<<endl;
}
