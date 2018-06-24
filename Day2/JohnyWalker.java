public class JohnyWalker
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++)
		{
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println("Johny Walker");
			else if (i % 3 == 0)
				System.out.println("Johny");
			else if (i % 5 == 0)
				System.out.println("Walker");
			else
				System.out.println(i);
		}
	}
}

/*
Output
1
2
Johny
4
Walker
Johny
7
8
Johny
Walker
11
Johny
13
14
Johny Walker
16
17
Johny
19
Walker
Johny
22
23
Johny
Walker
26
Johny
28
29
Johny Walker
31
32
Johny
34
Walker
Johny
37
38
Johny
Walker
41
Johny
43
44
Johny Walker
46
47
Johny
49
Walker
Johny
52
53
Johny
Walker
56
Johny
58
59
Johny Walker
61
62
Johny
64
Walker
Johny
67
68
Johny
Walker
71
Johny
73
74
Johny Walker
76
77
Johny
79
Walker
Johny
82
83
Johny
Walker
86
Johny
88
89
Johny Walker
91
92
Johny
94
Walker
Johny
97
98
Johny
Walker
*/