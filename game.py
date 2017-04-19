def main():
    width = input("Give width ")
    height = input("Give height ")

    print(create_board(width, height))
    #print_board(board)


def create_board(width,height):
    width = int(width)
    height = int(height)
    up_board= "X" * width
    middle_board=("X" + (" " * (width-2)) + "X")
    down_board= "X" * width
    board = []
    board.append(list(up_board))
    for line in range (0, height):
        board.append(list(middle_board))
    board.append(list(down_board))
    return board
main()
