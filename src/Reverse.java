class Reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(reverse("abc"));
	}
	
	public static String reverse(String str) {
	if (str == null || str == "") { return str; }

	char[] arr = str.toCharArray();

	int i = 0;
	int j = arr.length;
	char temp = arr[0];

	while (j>i) {
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		i++;
		j--;
	}
	
	return new String(arr);
}
}