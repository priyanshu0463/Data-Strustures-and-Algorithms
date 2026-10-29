
def print_subsequences(ind, ds, arr, n):
    """
    ind : Index of the element currently being considered.
    ds  : List storing the current subsequence.
    arr : Original input array.
    n   : Total number of elements in the array.
    """

    # BASE CASE:
    # If ind == n, all elements have been considered.
    # The current ds represents one complete subsequence.
    if ind == n:
        print(ds)
        return

    # CASE 1: PICK
    # Include the current element in the subsequence.
    ds.append(arr[ind])

    # Explore all possibilities with this element included.
    print_subsequences(ind + 1, ds, arr, n)

    # BACKTRACKING:
    # Remove the element we just added.
    # Restore ds before exploring the next branch.
    ds.pop()

    # CASE 2: NOT PICK
    # Skip the current element and move to the next index.
    # ds remains unchanged in this branch.
    print_subsequences(ind + 1, ds, arr, n)


# Main program
arr = [3, 1, 2]
n = len(arr)

# Initially, the current subsequence is empty.
ds = []

# Begin recursion from index 0.
print_subsequences(0, ds, arr, n)
