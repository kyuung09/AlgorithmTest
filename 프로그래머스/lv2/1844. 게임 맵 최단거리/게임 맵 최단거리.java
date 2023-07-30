import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static Queue<int[]> personA;
    static Queue<int[]> personB;

    public int solution(int[][] maps) {
        int answer = 0;
        int map_width = maps[0].length;
        int map_height = maps.length;
        map = new char[map_height][map_width];

        personA = new LinkedList<>();
        personB = new LinkedList<>();

        // 나, 상대편의 현재 위치 및 이동 숫자
        personA.add(new int[]{0, 0, 0});
        personB.add(new int[]{map_height - 1, map_width - 1, 0});

        exploreMap(map_width, map_height);

        // 두 사람이 만나는 최소 거리 계산
        while (!personA.isEmpty() && !personB.isEmpty()) {
            int[] posA = personA.poll();
            int[] posB = personB.poll();

            if (posA[0] == posB[0] && posA[1] == posB[1]) {
                answer = posA[2] + posB[2];
                break;
            }
        }

        return (answer == 0) ? -1 : answer;
    }

    public static void exploreMap(int map_width, int map_height) {
        while (!personA.isEmpty()) {
            int[] pos = personA.poll();
            int x = pos[0];
            int y = pos[1];
            int count = pos[2];

            int w = map_width;
            int h = map_height;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < w && ny >= 0 && ny < h && map[ny][nx] == 0) {
                    map[ny][nx] = 1;
                    personA.add(new int[]{nx, ny, count + 1});
                }
            }
        }

        while (!personB.isEmpty()) {
            int[] pos = personB.poll();
            int x = pos[0];
            int y = pos[1];
            int count = pos[2];

            int w = map_width;
            int h = map_height;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < w && ny >= 0 && ny < h && map[ny][nx] == 0) {
                    map[ny][nx] = 1;
                    personB.add(new int[]{nx, ny, count + 1});
                }
            }
        }
    }
}