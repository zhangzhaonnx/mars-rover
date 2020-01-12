# Mars Rover
## Tasking

1. 初始化信息：火星车的降落地点（x, y）和朝向（N, S, E, W）信息

- init:(0, 0, N), report:(0, 0, N)

2. 移动指令：火星车可以前进（M）,一次移动一格；
- init:(0, 0, N), move, report(0, 1, N)
- init:(0, 0, S), move, report(0, -1, N)
- init:(0, 0, E), move, report(1, 0, N)
- init:(0, 0, W), move, report(-1, 0, N)

3. 转向指令：火星车可以左转90度（L）或右转90度（R)
- init:(0, 0, N), turn left, report(0, 0, W)
- init:(0, 0, S), turn left, report(0, 0, E)
- init:(0, 0, E), turn left, report(0, 0, N)
- init:(0, 0, W), turn left, report(0, 0, S)

- init:(0, 0, N), turn right, report(0, 0, E)
- init:(0, 0, S), turn right, report(0, 0, W)
- init:(0, 0, E), turn right, report(0, 0, S)
- init:(0, 0, W), turn right, report(0, 0, N)
