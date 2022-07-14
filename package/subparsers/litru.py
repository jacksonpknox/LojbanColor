import glob

#TODO: implement
def summarize_directory(directory: str):
    files = glob.glob(directory + "/**/*.jbo", recursive=True)
    for file in files:
        print(file)
    

def parse(args: dict):
    if d := args.directory:
        summarize_directory(d)