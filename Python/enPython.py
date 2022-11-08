class AudioPlayer :
    
    def __init__(self,isOpen,isPlaying,volume):
        print('The AudioPlayer constructor was invoked.')
        self.isOpen=False
        self.isPlaying=False
        self.volume=volume
        
    def __del__(self):
        print('The AudioPlayer destructor was invoked.')
    
    def open (self,filePath):
        self.isOpenisOpen = True # Por ahora simulamos la apertura correcta.
        print(f'The audiofile: {filePath} is open.')
    
    def play(self):
        if self.isOpen :
            print('The audiofile is playing.')
    
    def stop(self):
        if self.isPlaying :
            print('The audiofile is stopped.')
    
    def setVolume(self ,value):
        self.volume=value
        print(f'The volume is: {self.volume}')
        
class VLC(AudioPlayer):
    def __init__(self, isOpen, isPlaying, volume,pitch):
        self.isOpen=isOpen
        self.isPlaying=isPlaying
        self.volume=volume
        self.pitch=pitch
    
    def __del__(self):
        print('The VLC destructor was invoked.')
        
    def setPitch(self,value):
        self.pitch=value
        print(f'The pitch is: {self.pitch}')
        
def main():
    player = AudioPlayer(False,False,10)
    player.open('./resources/orchestral.ogg')
    player.play()
    player.setVolume(4)
    print('\n')
    vlcPlayer = VLC(False,False,10,0)
    vlcPlayer.open("./resources/orchestral.ogg")
    vlcPlayer.play()
    vlcPlayer.setVolume(13)
    print('\n')
main()                