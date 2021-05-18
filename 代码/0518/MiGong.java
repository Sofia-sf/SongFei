
public class MiGong{
	// 编写一个main方法
	public static void main(String[] args){
		// 老鼠走迷宫问题
		// 1.创建迷宫map，用二维数组表示，1表示墙
		int[][] map = new int[14][14];
		for(int i = 0; i < map.length; i++){
			if(i==0 || i == map.length-1){
				for(int j = 0; j < map[i].length; j++){
					map[i][j] = 1;
				}
			}else{
				map[i][0] = 1;
				map[i][map[i].length-1] = 1;
			}
			
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[1][5] = 1;
		map[2][5] = 1;
		map[3][5] = 1;
		map[4][5] = 1;
		map[5][5] = 1;
		map[10][4] = 1;
		map[11][4] = 1;
		map[12][4] = 1;

		System.out.println("======出发前地图情况=======");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		T tools = new T();
		tools.findWay(map, 1, 1);

		System.out.println("======出发后地图情况=======");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T{
	// 定义找迷宫出路方法
	public boolean findWay(int[][] map, int i, int j){
		// map地图中0表示可以走但是还没走过的路，
		// 		   1表示墙，一定不能走
		// 		   2表示可以走
		// 		   3表示走过，但是该路为思路，不能走
		if(map[map.length-2][map[0].length-2] == 2){// 说明已经找到出路
			return true;
		}else{
			if(map[i][j] == 0){ // 当前这个位置为0，可以走
				// 假设这条路可以走通
				map[i][j] = 2;
				if(findWay(map, i + 1, j)){// 下
					return true;
				}else if(findWay(map, i, j + 1)){ // 右
					return true;
				}else if(findWay(map, i, j - 1)){ // 左
					return true;
				}else if(findWay(map, i - 1, j)){ // 上
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
			}else{
				return false;
			}
		}
	}
}