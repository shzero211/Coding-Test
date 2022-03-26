package °íµæÁ¡Kit.ÇØ½¬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;




public class º£½ºÆ®¾Ù¹ü {
	
class GenreInfo implements Comparable<GenreInfo>{
		String genre;
		int sum;
		int count;
		int[] index=new int[2];
		 GenreInfo(String genre) {
			this.genre=genre;
			sum=0;
			count=0;
			index[0]=-1;
			index[1]=-1;
		}
		int getSum() {
			return sum;
		}
		@Override
		public int compareTo(GenreInfo rhs) {
			int compareQuantity=rhs.getSum();
			return compareQuantity-this.sum;
		}
		
	}

class MusicInfo implements Comparable<MusicInfo>{
	
	int id;
	String genre;
	int playCount;
	public MusicInfo(int id,String genre,int playCount) {
		this.id=id;
		this.genre=genre;
		this.playCount=playCount;
	}

	int getPlayCount() {
		return playCount;
	}

	@Override
	public int compareTo(MusicInfo rhs) {
		int compareQuantity=rhs.getPlayCount();
		return compareQuantity-this.playCount;
	}
	
}
	
public int[] solution(String[] genres, int[] plays) {
		int [] answer= {};
		MusicInfo[] musicInfos= new MusicInfo[genres.length];
		HashMap<String,GenreInfo> hm=new HashMap<String, GenreInfo>();
		GenreInfo[] genreInfos;
		for(int i=0;i<genres.length;i++) {
			musicInfos[i]=new MusicInfo(i,genres[i],plays[i]);
			if(false==hm.containsKey(genres[i])) {
				GenreInfo genre=new GenreInfo(genres[i]);
				hm.put(genres[i],genre);
			}
		}
		Arrays.sort(musicInfos);
		for(MusicInfo music:musicInfos) {
			GenreInfo genre=hm.get(music.genre);
			genre.sum+=music.playCount;
			if(genre.count<2)
				genre.index[genre.count]=music.id;
			genre.count++;
		}
		genreInfos=new GenreInfo[hm.size()];
		int idx=0;
		int musicCount=0;
		for(String key:hm.keySet()) {
			genreInfos[idx]=hm.get(key);
			musicCount+=Math.min(genreInfos[idx].count,2);
			idx++;
		}
		Arrays.sort(genreInfos);
		answer=new int[musicCount];
		idx=0;
		for(GenreInfo genre:genreInfos) {
			int limit=Math.min(genre.count,2);
			for(int i=0;i<limit;i++,idx++) {
				answer[idx]=genre.index[i];
			}
		}
		 	
	        return answer;
	    }
}
